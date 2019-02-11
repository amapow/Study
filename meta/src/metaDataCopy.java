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
    public String print(String path) throws ImageProcessingException, IOException {
        this.path = path;
        File file = new File(path);
        Metadata metadata = JpegMetadataReader.readMetadata(file);
        ExifSubIFDDirectory directory = metadata.getFirstDirectoryOfType(ExifSubIFDDirectory.class);
        if (directory == null) {
            return "null";
        }
        String date = directory.getString(ExifSubIFDDirectory.TAG_DATETIME_ORIGINAL);
        String returnDate = date;
        return returnDate;
    }
    public String formatDate() throws ImageProcessingException, IOException {
        String date = print(this.path);
        if(date.length() < 10) {
            return "null";
        }
        String formatDate = date.substring(0,10);
        return formatDate;
    }
    public void makeDirectory(String path, String outputPath, String fileName) throws ImageProcessingException, IOException {
        this.path = path;
        File checkOutPath = new File(outputPath);
        if (checkOutPath.exists() == false) {
            checkOutPath.mkdir();
        }
        String temp = formatDate();
        if (formatDate() == "null")
            return;
        String year = temp.substring(0, 4);
        String month = temp.substring(5, 7);
        String day = temp.substring(8, 10);
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

public class metaDataCopy {
    public static void main(String[] args) throws ImageProcessingException, IOException {
        //inputPath로 사진을 읽어올 폴더를 지정 후 file 객체를 생성하여 flist 배열에 file 객체에 저장 된 폴더내 파일들의 list를 저장
        //String inputpath = "/Users/janghyeon/Pictures/test/";
        String inputPath = "c:/";
        String outputPath = "d:/test/";
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