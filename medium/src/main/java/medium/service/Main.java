package medium.service;

import medium.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<User>userList=new ArrayList<>();

    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {



        bilgileriGoster();
        int secim=scanner.nextInt();
        while(secim!=0){
            switch (secim){
                case 1:
                    userList.add(userCreate());

                    break;
            }

        }

        // ödevi bu şekilde devam ettirecektim fakat bazı sebeplerden dolayı devam edemediğim için burda kalmış oldu :(




    }

    public static void bilgileriGoster(){
        System.out.println("kullanıcı oluşturmak için 1'e basınız.");
    }

    public static User userCreate(){
        System.out.println("oluşturmak istediğiniz kullanıcının ismini girin:");
        String name=scanner.next();
        System.out.println(name+" soy ismini giriniz");
        String surname =scanner.next();
        System.out.println(name+"'in mailini giriniz:");
        String mail =scanner.next();
        if(userList.stream().anyMatch(musteri -> musteri.getMail().equals(mail))){
            System.out.println(mail+" Kullanıcı adi ile daha once kayıt yapılmıştır . tekrar deneyiniz.");
            userCreate();
        }
        System.out.println("şifre giriniz");
        String password=scanner.next();
        return new User(name,surname,mail,password);
    }


}
