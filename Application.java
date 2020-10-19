package FileIO2;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
public class Application {
    public static void main(String... args)  throws IOException{
        var fileName = "./Assignment1/FileIO2/src/main/java/FileIO2/data.txt";
        // it is agood habit to check if the file can be found programetically
        var filePath = Paths.get(fileName);
        if(!Files.exists(filePath)){
            System.out.println("The File "+ fileName + " Could not be found");
        }
        
        var readStream = Files.newBufferedReader(filePath);
        var data = readStream.readLine();
        System.out.println("The data  "+ data);
        if(data!=null){System.out.println(data.toUpperCase());
        data= readStream.readLine();
    }
        if(data!=null){System.out.println(data.toUpperCase());
            data= readStream.readLine();
            }
            if(data!=null){System.out.println(data.toUpperCase());
                data= readStream.readLine();
                }
                if(data!=null){System.out.println(data.toUpperCase());
                    data= readStream.readLine();
                    }
                    if(data!=null){System.out.println(data.toUpperCase());
                        data= readStream.readLine();
                        }
                        if(data!=null){System.out.println(data.toUpperCase());
                            data= readStream.readLine();
                            }
        if(data==null){System.out.println("end of file reached");
    }
    }  
}
