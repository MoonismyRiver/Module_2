package IO_TextFile.Copy_fileText;

import IO_TextFile.ThucHanh_Tim_GTLNvaGhiRaFile.ReadAndWriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Copyfile {
    public List<String> readFile(String filePath) {
        List<String> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                numbers.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }


    public void writeFile(String filePath, List<String> numbers) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (int i = 0; i < numbers.size(); i++) {
                bufferedWriter.write(numbers.get(i)+"\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Copyfile copyfile = new Copyfile();
        copyfile.writeFile("C:\\Users\\admin\\Desktop\\Module 2\\NhapMonJava\\src\\IO_TextFile\\Copy_fileText\\Paste", copyfile.readFile("C:\\Users\\admin\\Desktop\\Module 2\\NhapMonJava\\src\\IO_TextFile\\Copy_fileText\\Copy"));
    }
}
