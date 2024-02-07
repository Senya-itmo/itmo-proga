package CommandProvider.Commands;

import SpaceMarines.SpaceMarine;

import java.util.Vector;

public class AddMax {
    public static void AddMaxCommand(Vector<SpaceMarine> collection){
        SpaceMarine sp = new SpaceMarine();
        System.out.println("��������� ��������");
        System.out.println(sp);
        int maxId=0;

        for(SpaceMarine s: collection){
            if(s.getId()>maxId){
                maxId = s.getId();
            }
        }
        System.out.println("������������ ��������: "+ String.valueOf(maxId));
        System.out.println("�������� ���������: "+ String.valueOf(sp.getId()));
        if(sp.getId()>maxId){
            System.out.println("���������!");
            collection.add(sp);
        }else{
            System.out.println("�� ���������!");
        }
    }
}
