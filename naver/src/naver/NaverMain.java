package naver;

import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;

public class NaverMain {
    public static void main(String[] args) throws AuthenException {

        Scanner sc = new Scanner(System.in);
        Naver ob = new Naver();
        Mail mail = new Mail();

        int ch;

        boolean session = false;

        while (true) {

            do {

                System.out.println("1.입력 2.수정 3.탈퇴 4.회원전체출력 5.아이디검색 6.로그인 7.비번찾기 8.종료");
                System.out.println("\n--------------------------\n");
                ch = sc.nextInt();
            } while (ch < 1 || ch > 8);

            System.out.println();

            switch (ch) {

                case 1:
                    ob.insert();
                    System.out.println();
                    break;
                case 2:
                    ob.update();
                    System.out.println();
                    break;
                case 3:
                    ob.delete();
                    System.out.println();
                    break;
                case 4:
                    ob.selectAll();
                    System.out.println();
                    break;
                case 5:
                    ob.searchId();
                    System.out.println();
                    break;
                case 6:
                    NaverDTO naverDTO = ob.login();
                    System.out.println();

                    if (naverDTO != null) {
                        session = true;
                        System.out.println("로그인 성공");

                        int loginMenu;
                        while (true) {

                            do {
                                System.out.println("1.받은메일함 2.보낸메일함 3.메일보내기 4.휴지통 5.로그아웃");
                                System.out.println("\n--------------------------\n");
                                loginMenu = sc.nextInt();


                            } while (loginMenu < 1 || loginMenu > 5);

                            switch (loginMenu) {

                                case 1:
                                    mail.selectReceiveAll(naverDTO.getId());
                                    System.out.println();
                                    break;
                                case 2:
                                    mail.selectSendAll(naverDTO.getId());
                                    System.out.println();
                                    break;
                                case 3:
                                    mail.sendMail(naverDTO.getId());
                                    break;
                                case 4:
                                    mail.selectDelAll(naverDTO.getId());
                                    break;
                            }
                            if(loginMenu == 5) {
                                break;
                            }
                        }
                    } else {
                        System.out.println("로그인 실패");
                    }

                    break;
                case 7:
                    ob.searchPassword();
                    System.out.println();
                    break;
                case 8:
                    ConnectionFactory DBConn = new ConnectionFactory();
                    System.exit(0);


            }
        }
    }

}
