package SpaceMarines;

import java.io.Serializable;

import static SpaceMarines.JustScanner.Scan;

public class Chapter implements Serializable {
    private String name; //���� �� ����� ���� null, ������ �� ����� ���� ������
    private String parentLegion;
    private Integer marinesCount; //���� ����� ���� null, �������� ���� ������ ���� ������ 0, ������������ �������� ����: 1000

    public void makeChapter(){
        while(true){
            System.out.print("������� ��� Chapter: ");
            String name = Scan();
            if (name.replaceAll(" ", "")==""){
                System.out.println("�� ����� ������ ������!");
            }else{
                setName(name);
                break;
            }
        }
        System.out.print("������� parentLegion: ");
        String pl = Scan();
        if (pl.replaceAll(" ", "")==""){
            this.parentLegion =null;
        }else{
            setParentLegion(pl);
        }

        while(true){
            System.out.print("������� 0<marinesCount<=1000: ");
            String mc = Scan();
            if (mc.replaceAll(" ", "")==""){
                this.marinesCount =null;
            }else{
                try{
                    if(Integer.parseInt(mc)>0 && Integer.parseInt(mc)<=1000){
                        setMarinesCount(Integer.parseInt(mc));
                        break;
                    }else{
                        System.out.println("����� ������ ���� ������ 0, �� ������ 1000!");
                    }
                }catch(NumberFormatException e){
                    System.out.println("���� ������ int ��� ������ ������!");
                }
            }
        }

    }

    private void setName(String name){
        this.name = name;
    }
    private void setParentLegion(String pl){
        parentLegion = pl;
    }
    private void setMarinesCount(int mc){
        marinesCount = mc;
    }

    @Override
    public String toString(){
        return("\n\tname: "+name+"\n\tparentLegion: "+parentLegion+"\n\tmarinesCount: "+marinesCount);
    }

    public int getMarinesCount(){
        return marinesCount;
    }
}