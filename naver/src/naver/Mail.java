package naver;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Mail {

    Scanner sc = new Scanner(System.in);
    MailDAO dao = new MailDAO();

    public void selectSendAll(String id) {

        List<MailDTO> lists = dao.getList(id, "send", "N");

        Iterator<MailDTO> it = lists.iterator();

        int i = 1;
        System.out.println("보낸 메일함");
        System.out.println("-------------------------------------------------");
        System.out.println("ID\t제목\t내용\t발신자\t수신자\t수신확인\t수신일");

        while (it.hasNext()) {

            MailDTO dto = it.next();
            System.out.println(dto.getMailId() + "\t" + dto.getTitle() + "\t" + dto.getContents() + "\t" + dto.getSendId() + "\t" + dto.getReceiveId() + "\t" + dto.getRead() + "\t" + dto.getSendDate());
            i++;
        }

        while(true) {

            System.out.println("1.메일읽기 2.종료");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("읽을 메일 ID : ");
                    int mailId = sc.nextInt();
                    readMail(mailId);
                    break;
                case 2:
                    return;
            }

        }
    }

    public void readMail(int mailId) {

        MailDTO dto = dao.getMail(mailId);

        System.out.println("보낸 사람 : " + dto.getSendId());
        System.out.println("받는 사람 : " + dto.getReceiveId());
        System.out.println("제목 : " + dto.getTitle());
        System.out.println("내용 : " + dto.getContents());
        System.out.println("보낸 날짜 : " + dto.getSendDate());

    }

    public void deleteMail(int mailId) {

        int result = dao.updateDelMail(mailId);

        if (result != 0)
            System.out.println("메일이 삭제되었습니다");
        else
            System.out.println("메일 삭제에 실패했습니다");

    }

    public void selectReceiveAll(String id) {

        List<MailDTO> lists = dao.getList(id, "receive", "N");

        Iterator<MailDTO> it = lists.iterator();

        int i = 1;
        System.out.println("받은 메일함");
        System.out.println("-------------------------------------------------");
        System.out.println("ID\t제목\t내용\t발신자\t수신자\t수신일");

        while (it.hasNext()) {

            MailDTO dto = it.next();
            System.out.println(dto.getMailId() + "\t" + dto.getTitle() + "\t" + dto.getContents() + "\t" + dto.getSendId() + "\t" + dto.getReceiveId() + "\t" + dto.getSendDate());
            i++;
        }

        while(true) {
            System.out.println("1.메일읽기 2.메일삭제 3.종료");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("읽을 메일 ID : ");
                    int mailId = sc.nextInt();
                    readMail(mailId);
                    break;
                case 2:
                    System.out.print("삭제할 메일 ID : ");
                    int mailId2 = sc.nextInt();
                    deleteMail(mailId2);
                    break;
                case 3:
                    return;
            }

        }

    }

    public void sendMail(String id) {

        MailDTO dto = new MailDTO();

        System.out.print("받는 사람 아이디 : ");
        dto.setReceiveId(sc.next());

        System.out.print("제목 : ");
        dto.setTitle(sc.next());

        System.out.print("내용 : ");
        dto.setContents(sc.next());

        dto.setSendId(id);

        int result = dao.insertMail(dto);

        if (result != 0)
            System.out.println("메일이 전송되었습니다");
        else
            System.out.println("메일 전송에 실패했습니다");

    }


    public void selectDelAll(String id) {

        List<MailDTO> lists = dao.getList(id, "receive", "Y");

        Iterator<MailDTO> it = lists.iterator();

        int i = 1;
        System.out.println("휴지통");
        System.out.println("-------------------------------------------------");
        System.out.println("ID\t제목\t내용\t발신자\t수신자\t수신일");

        while (it.hasNext()) {

            MailDTO dto = it.next();
            System.out.println(dto.getMailId() + "\t" + dto.getTitle() + "\t" + dto.getContents() + "\t" + dto.getSendId() + "\t" + dto.getReceiveId() + "\t" + dto.getSendDate());
            i++;
        }

        while(true) {

            System.out.println("1.메일읽기 2.메일삭제 3.복구 4.종료");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("읽을 메일 ID : ");
                    int mailId = sc.nextInt();
                    readMail(mailId);
                    break;
                case 2:
                    System.out.print("삭제할 메일 ID : ");
                    int mailId2 = sc.nextInt();
                    deleteMail(mailId2);
                    break;
                case 3:
                    System.out.print("복구할 메일 ID : ");
                    int mailId3 = sc.nextInt();
                    recoverMail(mailId3);
                    break;
                case 4:
                    return;
            }

        }
    }


    public void deleteTrashMail(int mailId) {

        int result = dao.deleteDate(mailId);

        if (result != 0)
            System.out.println("메일이 삭제되었습니다");
        else
            System.out.println("메일 삭제에 실패했습니다");

    }

    private void recoverMail(int mailId3) {

        int result = dao.recoverDelMail(mailId3);

        if (result != 0)
            System.out.println("메일이 복구되었습니다");
        else
            System.out.println("메일 복구에 실패했습니다");
    }
}