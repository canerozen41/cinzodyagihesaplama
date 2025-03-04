import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan doğum yılını al
        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        // Çin Zodyağı burcunu hesaplamak için doğum yılını 12'ye bölerek kalanını buluyoruz
        int kalan = dogumYili % 12;

        // Çin Zodyağı burcunu belirleme
        String burc = "";
        switch (kalan) {
            case 0: burc = "Maymun"; break;
            case 1: burc = "Horoz"; break;
            case 2: burc = "Köpek"; break;
            case 3: burc = "Domuz"; break;
            case 4: burc = "Fare"; break;
            case 5: burc = "Öküz"; break;
            case 6: burc = "Kaplan"; break;
            case 7: burc = "Tavşan"; break;
            case 8: burc = "Ejderha"; break;
            case 9: burc = "Yılan"; break;
            case 10: burc = "At"; break;
            case 11: burc = "Koyun"; break;
            default: burc = "Hatalı giriş";
        }

        // Sonucu ekrana yazdır
        System.out.println("Çin Zodyağı Burcunuz: " + burc);

        scanner.close();
    }
}