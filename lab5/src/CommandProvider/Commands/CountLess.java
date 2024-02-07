package CommandProvider.Commands;

import SpaceMarines.SpaceMarine;

import java.util.Vector;

public class CountLess {
    public static void CountLessCommand(Vector<SpaceMarine> collection, String chapterString){

        int count=0;

        try{
            int chapterValue = Integer.parseInt(chapterString);
            for(SpaceMarine sp: collection){
                int value = sp.getChapter().getMarinesCount(); //�������� �������� �������
                if(value<chapterValue){
                    count++;
                }
            }
        }catch(NumberFormatException e){
            System.out.println("���� ������ �������� chapter int!");
        }
        System.out.println("���-�� ���������, �������� ���� chapter ������� ������ ���������: "+count);
    }
}
