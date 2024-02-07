package CommandProvider.Commands;

import SpaceMarines.SpaceMarine;

import java.util.Vector;

public class Remove {
    public static void RemoveCommand(Vector<SpaceMarine> collection, String[] commandToWords){
        if (commandToWords.length != 2) {
            System.out.println("������ ����� �������!");
        } else {
            try {
                boolean isId = true;
                int cmdId = Integer.parseInt(commandToWords[1]);
                for(SpaceMarine o: collection){
                    if (cmdId==o.getId()){
                        collection.remove(o);
                        isId = false;
                        System.out.println("������� ������ SpaceMarine � id: "+ cmdId);
                    }
                }
                if(isId){
                    System.out.println("SpaceMarine � ����� id ����!");
                }
            } catch (NumberFormatException e) {
                System.out.println("������ id - int!");
            }
        }
    }
}
