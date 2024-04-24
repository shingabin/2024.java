package naver;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Naver {

    Scanner sc = new Scanner(System.in);
    NaverDAO dao = new NaverDAO();

    NaverException ne = new NaverException();

    //ȸ������

    public void insert() throws AuthenException {

        String pw2 = null;
        boolean id = true;
        boolean pw = true;
        boolean name = true;
        boolean gender = true;
        boolean tel = true;

        System.out.println("ȸ������");
        System.out.println("-----------------------");

        try {
            NaverDTO dto = new NaverDTO();

            do {
                try {
                    System.out.print("���̵�");
                    dto.setId(sc.next());
                    ne.idFormat(dto.getId());

                    id = false;


                } catch (AuthenException e) {
                    System.out.println(e.toString());
                }

            } while (id);

            do {
                try {
                    System.out.print("��й�ȣ");
                    dto.setPw(sc.next());

                    System.out.print("��й�ȣ Ȯ��");
                    pw2 = sc.next();
                    ne.pwCheck(dto.getPw(), pw2);

                    pw = false;
                } catch (AuthenException e) {
                    System.out.println(e.toString());
                }
            } while (pw);

            do {
                try {
                    System.out.print("�̸�");
                    dto.setName(sc.next());
                    ne.nameCheck(dto.getName());

                    name = false;
                } catch (AuthenException e) {
                    System.out.println(e.toString());
                }

            } while (name);

            do {
                try {
                    System.out.print("����[��/��]");
                    dto.setGender(sc.next());
                    ne.genCheck(dto.getGender());

                    gender = false;
                } catch (AuthenException e) {
                    System.out.println(e.toString());
                }
            } while (gender);

            System.out.print("����[xxxx-xx-xx]");
            dto.setBirth(sc.next());

            System.out.print("�̸���[xxxxx@naver.com]");
            dto.setEmail(sc.next());

            do {
                try {
                    System.out.print("��ȭ��ȣ[xxx-xxxx-xxxx]");
                    dto.setTel(sc.next());
                    ne.phoneCheck(dto.getTel());

                    tel = false;
                } catch (AuthenException e) {
                    System.out.println(e.toString());
                }
            } while (tel);

            int result = dao.insertData(dto);

            if (result != 0) {
                System.out.println();
                System.out.println("****���������� ������ �Ϸ�Ǿ����ϴ�****");
                System.out.println();

                System.out.println("-------[ȸ������ Ȯ��]-------");
                System.out.println(dto.toString());
            } else
                System.out.println("ȸ�����Կ� �����߽��ϴ�...");

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    //����
    public void update() {

        try {
            NaverDTO dto = new NaverDTO();

            System.out.print("���� �� ���̵�");
            dto.setId(sc.next());

            System.out.print("��й�ȣ");
            dto.setPw(sc.next());

            System.out.print("�̸���[xxxxx@naver.com]");
            dto.setEmail(sc.next());

            System.out.print("��ȭ��ȣ[xxx-xxxx-xxxx]");
            dto.setTel(sc.next());

            int result = dao.updateData(dto);

            if (result != 0)
                System.out.println("ȸ�������� �����Ǿ����ϴ�");
            else
                System.out.println("ȸ������������ �����߽��ϴ�");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    //Ż��
    public void delete() {

        try {
            String id, pw;

            System.out.print("Ż�� �� �Ƶ�");
            id = sc.next();

            System.out.print("��� Ȯ��");
            pw = sc.next();

            int result = dao.deleteDate(id, pw);

            if (result != 0)
                System.out.println("���������� Ż���Ͽ����ϴ�\n������ �ٽ� �������ּ���");
            else
                System.out.println("Ż�� �����߽��ϴ�\nȸ�����γ����ּ���");

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    //ȸ�� ��ü ���
    public void selectAll() {

        List<NaverDTO> lists = dao.getList();

        Iterator<NaverDTO> it = lists.iterator();

        int i = 1;
        while (it.hasNext()) {

            NaverDTO dto = it.next();
            System.out.println("[ȸ�� " + i + "]");
            System.out.println(dto.toString());
            i++;
        }

    }
    //�Ƶ�˻�

    public void searchId() {

        System.out.print("�˻� �� ���̵�");
        List<NaverDTO> lists = dao.getList(sc.next());

        Iterator<NaverDTO> it = lists.iterator();

        if (!it.hasNext()) {
            System.out.println("�˻��� ���̵�� ���������ʽ��ϴ�.");
        }

        while (it.hasNext()) {
            NaverDTO dto = it.next();
            System.out.println(dto.toString());
        }
    }

    public NaverDTO login() {

        try {
            NaverDTO dto = new NaverDTO();

            System.out.print("���̵�");
            String id = sc.next();

            System.out.print("��й�ȣ");
            String password = sc.next();

            List<NaverDTO> result = dao.getLogin(id, password);

            if (result.size() != 0)
                return result.get(0);
            else
                return null;

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return null;
    }

    public void searchPassword() {

        System.out.print("�˻� �� ���̵�");
        List<NaverDTO> lists = dao.getList(sc.next());

        Iterator<NaverDTO> it = lists.iterator();

        if (!it.hasNext()) {
            System.out.println("�˻��� ���̵�� ���������ʽ��ϴ�.");
        }else{
            NaverDTO dto = it.next();
            System.out.println("��й�ȣ�� " + dto.getPw() + "�Դϴ�");
        }

    }
}