import com.drew.imaging.ImageProcessingException;
import com.drew.imaging.jpeg.JpegMetadataReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.ExifSubIFDDirectory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;


class Run {
    String path;
    public String print() throws ImageProcessingException, IOException {
        //path로 받은 경로의 파일의 메타데이터를 읽어 사진 촬영 일시를 리턴하는 메소드
        File file = new File(path);
        Metadata metadata = JpegMetadataReader.readMetadata(file);
        ExifSubIFDDirectory directory = metadata.getFirstDirectoryOfType(ExifSubIFDDirectory.class);
        //메타데이터가 없는 파일의 예외처리
        if (directory == null) {
            return "null";
        }
        String date = directory.getString(ExifSubIFDDirectory.TAG_DATETIME_ORIGINAL);
        return date;
    }
    public String formatDate() throws ImageProcessingException, IOException {
        //메타데이터의 촬영 일시를 yyyy:MM:dd로 포맷하여 리턴하는 메소드
        String date = print();
        if(date.length() < 10) {
            return "null";
        }
        String formatDate = date.substring(0,10);
        return formatDate;
    }
    public void makeDirectory(String path, String outputPath, String fileName) throws ImageProcessingException, IOException {
        //촬영 일시를 읽어 outputPath/yyyy/MM/dd로 폴더를 생성하는 메소드
        this.path = path;
        File checkOutPath = new File(outputPath);
        //checkOutPath가 없는 경우 폴더 생성
        if (checkOutPath.exists() == false) {
            checkOutPath.mkdir();
        }

        String formatDate = formatDate();
        if (formatDate() == "null")
            return;

        String year = formatDate.substring(0, 4);
        String month = formatDate.substring(5, 7);
        String day = formatDate.substring(8, 10);
        String outputPath_y = outputPath + year;
        File file_y = new File(outputPath_y);
        String outputPath_m = outputPath_y + "/" + month;
        File file_m = new File(outputPath_m);
        String outputPath_d = outputPath_m + "/" + day;
        File file_d = new File(outputPath_d);
        if (file_y.exists() == false) {
            file_y.mkdir();
        }
        if (file_m.exists() == false) {
            file_m.mkdir();
        }
        if (file_d.exists() == false) {
            file_d.mkdir();
        }

        File copyFile = new File(outputPath_d + "/" + fileName);
        copyFile(copyFile);
    }
    public void copyFile(File copyFile) throws IOException {
        //copyfile 리턴하고 copyfile 메소드 추가
        if (copyFile.exists() == false){
            long fsize = 0;
            FileInputStream fis = new FileInputStream(path);
            FileOutputStream fos = new FileOutputStream(copyFile);
            FileChannel fcin = fis.getChannel();
            FileChannel fcout = fos.getChannel();

            fsize = fcin.size();
            fcin.transferTo(0, fsize, fcout);

            fcout.close();
            fcin.close();
            fos.close();
            fis.close();
        }
    }
}
class CheckFile {
    public void checkFile(String inputPath, String outputPath) throws ImageProcessingException, IOException{
        if (inputPath.endsWith("/") == false) {
            inputPath = inputPath + "/";
        }
        if (outputPath.endsWith("/") == false) {
            outputPath = outputPath + "/";
        }

        File file = new File(inputPath);
        String[] flist = file.list();
        String path;

        for (int i = 0; i < flist.length; i++) {
            if (flist[i].length() > 4) {
                if (flist[i].substring(flist[i].length() - 3).equals("jpg") || flist[i].substring(flist[i].length() - 4).equals("jpeg")) {
                    Run run = new Run();
                    //inputPath에서 체크중인 jpg, jpeg 파일을 저장하는 file2 객체와 체크중인 jpg, jpeg 파일명을 String으로 저장하는 path
                    File file2 = new File(inputPath + flist[i]);
                    path = file2.toString();
                    //run.makeDirectory(path, "/Volumes/DATA/PHOTO/", flist[i]);
                    run.makeDirectory(path, outputPath, flist[i]);
                }
            }
        }
    }
}
public class MetaDataCopy {
    public static void main(String[] args) throws ImageProcessingException, IOException {
        //inputPath로 사진을 읽어올 폴더를 지정 후 file 객체를 생성하여 flist 배열에 file 객체에 저장 된 폴더내 파일들의 list를 저장
        //String inputpath = "/Users/janghyeon/Pictures/test/";
        String inputPath = "c:/";
        String outputPath = "d:/test/Date";
        CheckFile checkFile = new CheckFile();
        checkFile.checkFile(inputPath, outputPath);
    }
}