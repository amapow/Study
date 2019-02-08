import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.imaging.jpeg.JpegMetadataReader;
import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.imaging.jpeg.JpegSegmentMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.drew.metadata.exif.ExifReader;
import com.drew.metadata.exif.ExifSubIFDDirectory;
import com.drew.metadata.iptc.IptcReader;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
class Run{
    String path;
    public String print(String path) throws ImageProcessingException, IOException {
        this.path = path;
        File file = new File(path);
        System.out.println(file.getName());
        Metadata metadata = JpegMetadataReader.readMetadata(file);
        ExifSubIFDDirectory directory = metadata.getFirstDirectoryOfType(ExifSubIFDDirectory.class);
        if (directory == null) {
            return "metadata is null";
        }
        String date = directory.getString(ExifSubIFDDirectory.TAG_DATETIME_ORIGINAL);
        String returnDate = date;
        //Date 포맷을 yyyy:MM:dd로 짜름
        return returnDate;
    }
    public String formatDate() throws ImageProcessingException, IOException {
        String date = print(this.path);
        String formatDate = print(this.path).substring(0,10);
        return formatDate;
    }
}

class MakeDir{
    public void inputPath(String path){

    }
}
public class SampleUsage
{
    public static void main(String[] args) throws ImageProcessingException, IOException {
        String inputpath = args[0];
        File file = new File(inputpath);
        String[] flist = file.list();
        Date date;
        String path;
        int k = 0;
        String d = "";

        for(int i = 0; i < flist.length ; i++) {
            if (flist[i].substring(flist[i].length() - 3, flist[i].length()).equals("jpg") || flist[i].substring(flist[i].length() - 4, flist[i].length()).equals("jpeg")) {
                Run run = new Run();
                File file2 = new File(inputpath + flist[i]);
                path = file2.toString();
                System.out.println(run.print(path));
                System.out.println(run.formatDate());
                /*Metadata metadata = ImageMetadataReader.readMetadata(file2);
                ExifSubIFDDirectory directory = metadata.getFirstDirectoryOfType(ExifSubIFDDirectory.class);
                String modelName = directory.getString(ExifSubIFDDirectory.TAG_LENS_MODEL);
                System.out.println(modelName);*/
                //date = directory.getDate(ExifSubIFDDirectory.TAG_DATETIME_ORIGINAL);
                //SimpleDateFormat simdate = new SimpleDateFormat("yyyy-MM-dd");
                //d = date.toString();
                //System.out.println(d);
            }
        }
        //Metadata metadata = ImageMetadataReader.readMetadata(file);
        //ExifSubIFDDirectory directory = metadata.getFirstDirectoryOfType(ExifSubIFDDirectory.class);
        //Date date = directory.getDate(ExifSubIFDDirectory.TAG_DATETIME_ORIGINAL);
           /* for(int j = 0 ; j < flist2.length ; j++){
                if(flist2[j].substring(flist2[j].length() -3, flist2[j].length()).equals("jpg")){
                    File file2 = new File(inputpath + flist2[j]);
                    System.out.println(file2);
                    jpglist[k] = flist2[j];
                    k++;
                }
                //System.out.println(flist2[j].substring(flist2[j].length() - 3, flist2[j].length()));
            }*/
            //System.out.println(flist[i]);
        //File file2 = new File()
        /*for(int i = 0; i < jpglist.length; i++){
            Metadata metadata = ImageMetadataReader.readMetadata(file);
        }*/
    }
}