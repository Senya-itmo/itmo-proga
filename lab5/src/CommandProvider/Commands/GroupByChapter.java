package CommandProvider.Commands;

import SpaceMarines.SpaceMarine;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class GroupByChapter {
    public static void GroupByChapterCommand(Vector<SpaceMarine> collection){

        int nullCount=0;
        Map<Integer, Integer> groupsMap = new HashMap<>();//key - ���������� ��������, 2-�� Integer - ���-�� ����������
        //�� �������� Chapter ������� marinesCount

        for(SpaceMarine sp: collection){
            try{
                int value = sp.getChapter().getMarinesCount(); //�������� �������� �������
                UpdateGroupsMap(groupsMap, value);
            }catch (NullPointerException e){
                nullCount++;            }
        }

        for(Map.Entry<Integer, Integer> e:groupsMap.entrySet() ){ //��������� �� ���� "����+��������" � ���������� �� ������
            System.out.println("���������� Chapter �� ��������� "+ e.getKey()+" = "+e.getValue());
        }
        System.out.println("���������� Chapter �� ��������� null = "+nullCount);
    }

    private static void UpdateGroupsMap(Map<Integer, Integer> groupMap, int value){
        if(groupMap.containsKey(value)){ //���� ������ � ����� ������� ��� �����������
            groupMap.put(value, groupMap.get(value)+1);//��������� � ���-�� ���������� 1
        }else{
            groupMap.put(value, 1);//���� ���� ������� ����� ������ � 1
        }
    }
}
