package CommandProvider.Commands;

import java.sql.SQLOutput;

public class Help{
    public static void HelpCommand(){
        System.out.println("\n====================\n");

        System.out.println("help - ��������� �������");
        System.out.println("info - ���������� � ���������");
        System.out.println("show - ����� ���� ���������");
        System.out.println("add - �������� ����� ������� � ���������");
        System.out.println("update id {element} - �������� �������� �������� �� id");
        System.out.println("remove_by_id id - ������� ������� �� ��������� �� ��� id");
        System.out.println("clear - �������� ���������");
        System.out.println("save - ��������� ��������� � ����");
        System.out.println("execute_script file_name - ������� � ��������� ������");
        System.out.println("exit - ��������� ��������� (��� ���������� � ����)");
        System.out.println("add_if_max {element} - �������� ����� ������� � ���������, ���� ��� �������� ��������� �������� ����������� �������� ���� ���������");
        System.out.println("sort - ������������� ��������� � ������������ �������");
        System.out.println("history - ������� ��������� 6 ������");
        System.out.println("group_counting_by_chapter - ������������� �������� ��������� �� �������� ���� chapter, ������� ���������� ��������� � ������ ������");
        System.out.println("count_less_than_chapter chapter - ������� ���������� ���������, �������� ���� chapter ������� ������ ���������");
        System.out.println("count_greater_than_weapon_type weaponType - ������� ���������� ���������, �������� ���� weaponType ������� ������ ���������");
        System.out.println("cls - ������� �������");

        System.out.println("\n====================\n");
    }
}
