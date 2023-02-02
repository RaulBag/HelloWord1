import java.io.IOException;

public class start {

        public static void main (String[] args) throws IOException {

        char ch, answer = 'B';

        System.out.println(" Какую букву я загадал ? ");
        System.out.print("попытайтесь ее угадать: ");

        ch = (char)System.in.read();
        if (ch == answer){
                System.out.print("Я аплодирую:)! ");
        } else if (ch > answer) {
                System.out.print("Ты слишком запотел!)");
        } else {
                 System.out.print("Увы и Ах! ");
                }
        }

        }
