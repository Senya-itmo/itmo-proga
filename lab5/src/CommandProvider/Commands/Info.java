package CommandProvider.Commands;

import SpaceMarines.SpaceMarine;

import java.time.LocalDateTime;
import java.util.Vector;

public class Info {
    private java.time.LocalDateTime Date;

    public static void InfoCommand(Vector<SpaceMarine> collection){
        System.out.println("������ ���������: "+ String.valueOf(collection.size()));
        if(collection.size()>0) {
            java.time.LocalDateTime maxDate = collection.get(0).getDate();

            for (SpaceMarine sp : collection) {
                if (maxDate.isBefore(sp.getDate())) {
                    maxDate = sp.getDate();
                }
            }
            System.out.println("���� ���������� ��������� ���������: "+maxDate);
        }

        System.out.println("���-�� ���������: "+collection.size());

    }
}
