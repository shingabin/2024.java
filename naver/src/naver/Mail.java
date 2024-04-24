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
        System.out.println("���� ������");
        System.out.println("-------------------------------------------------");
        System.out.println("ID\t����\t����\t�߽���\t������\t����Ȯ��\t������");

        while (it.hasNext()) {

            MailDTO dto = it.next();
            System.out.println(dto.getMailId() + "\t" + dto.getTitle() + "\t" + dto.getContents() + "\t" + dto.getSendId() + "\t" + dto.getReceiveId() + "\t" + dto.getRead() + "\t" + dto.getSendDate());
            i++;
        }

        while(true) {

            System.out.println("1.�����б� 2.����");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("���� ���� ID : ");
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

        System.out.println("���� ��� : " + dto.getSendId());
        System.out.println("�޴� ��� : " + dto.getReceiveId());
        System.out.println("���� : " + dto.getTitle());
        System.out.println("���� : " + dto.getContents());
        System.out.println("���� ��¥ : " + dto.getSendDate());

    }

    public void deleteMail(int mailId) {

        int result = dao.updateDelMail(mailId);

        if (result != 0)
            System.out.println("������ �����Ǿ����ϴ�");
        else
            System.out.println("���� ������ �����߽��ϴ�");

    }

    public void selectReceiveAll(String id) {

        List<MailDTO> lists = dao.getList(id, "receive", "N");

        Iterator<MailDTO> it = lists.iterator();

        int i = 1;
        System.out.println("���� ������");
        System.out.println("-------------------------------------------------");
        System.out.println("ID\t����\t����\t�߽���\t������\t������");

        while (it.hasNext()) {

            MailDTO dto = it.next();
            System.out.println(dto.getMailId() + "\t" + dto.getTitle() + "\t" + dto.getContents() + "\t" + dto.getSendId() + "\t" + dto.getReceiveId() + "\t" + dto.getSendDate());
            i++;
        }

        while(true) {
            System.out.println("1.�����б� 2.���ϻ��� 3.����");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("���� ���� ID : ");
                    int mailId = sc.nextInt();
                    readMail(mailId);
                    break;
                case 2:
                    System.out.print("������ ���� ID : ");
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

        System.out.print("�޴� ��� ���̵� : ");
        dto.setReceiveId(sc.next());

        System.out.print("���� : ");
        dto.setTitle(sc.next());

        System.out.print("���� : ");
        dto.setContents(sc.next());

        dto.setSendId(id);

        int result = dao.insertMail(dto);

        if (result != 0)
            System.out.println("������ ���۵Ǿ����ϴ�");
        else
            System.out.println("���� ���ۿ� �����߽��ϴ�");

    }


    public void selectDelAll(String id) {

        List<MailDTO> lists = dao.getList(id, "receive", "Y");

        Iterator<MailDTO> it = lists.iterator();

        int i = 1;
        System.out.println("������");
        System.out.println("-------------------------------------------------");
        System.out.println("ID\t����\t����\t�߽���\t������\t������");

        while (it.hasNext()) {

            MailDTO dto = it.next();
            System.out.println(dto.getMailId() + "\t" + dto.getTitle() + "\t" + dto.getContents() + "\t" + dto.getSendId() + "\t" + dto.getReceiveId() + "\t" + dto.getSendDate());
            i++;
        }

        while(true) {

            System.out.println("1.�����б� 2.���ϻ��� 3.���� 4.����");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("���� ���� ID : ");
                    int mailId = sc.nextInt();
                    readMail(mailId);
                    break;
                case 2:
                    System.out.print("������ ���� ID : ");
                    int mailId2 = sc.nextInt();
                    deleteMail(mailId2);
                    break;
                case 3:
                    System.out.print("������ ���� ID : ");
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
            System.out.println("������ �����Ǿ����ϴ�");
        else
            System.out.println("���� ������ �����߽��ϴ�");

    }

    private void recoverMail(int mailId3) {

        int result = dao.recoverDelMail(mailId3);

        if (result != 0)
            System.out.println("������ �����Ǿ����ϴ�");
        else
            System.out.println("���� ������ �����߽��ϴ�");
    }
}