import com.drew.imaging.ImageProcessingException;
import com.drew.imaging.jpeg.JpegMetadataReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.ExifSubIFDDirectory;

import  java.io.FileInputStream;
import  java.io.FileOutputStream;
import  java.nio.channels.FileChannel;
import java.io.File;
import java.io.IOException;
import java.util.Date;


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
        //Date 포맷을 yyyy:MM:dd로 짜름
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
        File file = new File(path);
        File checkOutPath = new File(outputPath);
        if (checkOutPath.exists() == false){
            checkOutPath.mkdir();
        }
        String temp = formatDate();
        if (formatDate() == "null")
            return;
        String year = temp.substring(0,4);
        String month = temp.substring(5,7);
        String day = temp.substring(8,10);
        String outputPath_y = outputPath+year;
        File file_y = new File(outputPath_y);
        String outputPath_m = outputPath_y+"/"+month;
        File file_m = new File(outputPath_m);
        String outputPath_d = outputPath_m+"/"+day;
        File file_d = new File(outputPath_d);
        if (file_y.exists() == false){
            file_y.mkdir();
        }
        if (file_m.exists() == false){
            file_m.mkdir();
        }
        if (file_d.exists() ==false){
            file_d.mkdir();
        }
        File copyFile = new File(outputPath_d + "/" + fileName);

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
        else System.out.println("파일이 이미 존재합니다.");

    }
}

class MakeDir{
    public void inputPath(String path){

    }
}
public class SampleUsage {
    public static void main(String[] args) throws ImageProcessingException, IOException {
        //String inputpath = "/Users/janghyeon/Pictures/test/";
        String inputpath = "c:/";
        File file = new File(inputpath);
        String[] flist = file.list();
        Date date;
        String path;
        int k = 0;
        String d = "";

        for (int i = 0; i < flist.length; i++) {
            if (flist[i].length() > 4) {
                if (flist[i].substring(flist[i].length() - 3, flist[i].length()).equals("jpg") || flist[i].substring(flist[i].length() - 4, flist[i].length()).equals("jpeg")) {
                    Run run = new Run();
                    File file2 = new File(inputpath + flist[i]);
                    path = file2.toString();
                    //run.makeDirectory(path, "/Volumes/DATA/PHOTO/", flist[i]);
                    run.makeDirectory(path, "d:/test/", flist[i]);
                }
            }
            else System.out.println("Pass");
        }
    }
}