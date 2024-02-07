package CommandProvider.Commands;

import SpaceMarines.SpaceMarine;

import java.util.Collections;
import java.util.Vector;

public class Sort {
    public static Vector<SpaceMarine> SortCommand(Vector<SpaceMarine> collection){

        Vector<Integer> idVector = new Vector<>();
        Vector<SpaceMarine> sortedCollection = new Vector<>();

        for(SpaceMarine sp: collection){
            idVector.add(sp.getId());
        }
        Collections.sort(idVector); //�������� ������������� ������ �� ���������

        for(Integer id: idVector){
           for(SpaceMarine sp: collection){
               if(sp.getId()==id){
                   sortedCollection.add(sp); //���������� ���� ������� ��� �� ��� � � ����. �������
               }
           }
        }
        return sortedCollection;
    }
}
