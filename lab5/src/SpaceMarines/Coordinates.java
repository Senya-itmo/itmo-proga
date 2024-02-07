package SpaceMarines;

import java.io.Serializable;

import static SpaceMarines.JustScanner.Scan;

public class Coordinates implements Serializable {
    private int x;
    private Long y; //���� �� ����� ���� null
    public Coordinates(){
        while(true){
            try{
                System.out.print("������� (int)�: ");
                x = Integer.parseInt(Scan());
                break;
            }catch(NumberFormatException e){
                System.out.println("���� ������ �������� int!");
            }
        }

        while(true){
            try{
                System.out.print("������� (Long)y: ");
                y = Long.parseLong(Scan());
                break;
            }catch(NumberFormatException e){
                System.out.println("���� ������ �������� Long!");
            }
        }


    }
    @Override
    public String toString(){
        return ("x: "+String.valueOf(x)+", y: "+String.valueOf(y));
    }
}
