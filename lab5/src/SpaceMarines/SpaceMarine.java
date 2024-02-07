package SpaceMarines;

import java.io.Serializable;
import java.time.LocalDateTime;

import static SpaceMarines.JustScanner.Scan;

public class SpaceMarine implements Serializable { //������ �� ����� � ���� �������
    private int id; //�������� ���� ������ ���� ������ 0, �������� ����� ���� ������ ���� ����������, �������� ����� ���� ������ �������������� �������������
    private String name; //���� �� ����� ���� null, ������ �� ����� ���� ������
    private Coordinates coordinates = new Coordinates(); //���� �� ����� ���� null
    private java.time.LocalDateTime creationDate = LocalDateTime.now(); //���� �� ����� ���� null, �������� ����� ���� ������ �������������� �������������
    //private java.time.LocalDate creationDateWithoutTime = LocalDate.now(); // ���� ����� ��� � ���� �� ��� �����

    private Long health; //���� ����� ���� null, �������� ���� ������ ���� ������ 0
    private Long heartCount; //���� �� ����� ���� null, �������� ���� ������ ���� ������ 0, ������������ �������� ����: 3
    private Weapon weaponType; //���� ����� ���� null
    private MeleeWeapon meleeWeapon; //���� �� ����� ���� null
    private Chapter chapter; //���� ����� ���� null

    public SpaceMarine() {
        setChapter();
        setId();
        setName();
        setHealth();
        setHeartCount();
        setWeapon();
        setMeleeWeapon();
        System.out.println("SpaceMarine "+ name+" ������");
    }

    private void setChapter(){
        int chapterChoice=0;
        while(true) {
            try {
                System.out.print("���� ������ �������� Chapter, ������� 1 ����� 2: ");
                chapterChoice = Integer.parseInt(Scan());
                if (chapterChoice != 1 && chapterChoice != 2) {
                    System.out.println("������� 1 ��� 2!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("���� ������ int!");
            }
        }
        switch (chapterChoice){
            case 1:
                chapter = new Chapter();
                chapter.makeChapter();
                break;
            case 2:
                break;
        }
    }
    private void setMeleeWeapon() {
        while (true) {
            System.out.println("������� ����� ������ �������� ���");
            System.out.println("1 - POWER_SWORD\n2 - MANREAPER\n3 - POWER_FIST");
            try{
                int weaponChoice = Integer.parseInt(Scan());
                if (weaponChoice < 1 || weaponChoice > 3) {
                    System.out.println("�� ������� ������������ �����! ��������� � ������� ��� ���");
                } else {
                    switch (weaponChoice) {
                        case 1:
                            meleeWeapon = MeleeWeapon.POWER_SWORD;
                            break;
                        case 2:
                            meleeWeapon = MeleeWeapon.MANREAPER;
                            break;
                        case 3:
                            meleeWeapon = MeleeWeapon.POWER_FIST;
                            break;
                    }
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("���� ������ int!");
            }
        }
    }
    private void setHeartCount(){
        while (true) {
            System.out.print("������� heartCount(0<heartCount<=3): ");
            try{
                heartCount = Long.parseLong(Scan());
                if (heartCount>3 || heartCount<=0){
                    System.out.println("�������� heartCount ������ ���� �� 1 �� 3!");
                }else{
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("���� ������ Long");
            }

        }
    }

    private void setWeapon(){
        while(true){
            System.out.println("������� ����� ������ ������� ������ �����");
            System.out.println("1 - PLASMA_GUN,\n2 - GRENADE_LAUNCHER,\n3 - INFERNO_PISTOL,\n4 - MULTI_MELTA\n5 - ������(null)");
            try{
                int weaponChoice = Integer.parseInt(Scan());
                if (weaponChoice<1 || weaponChoice>5){
                    System.out.println("�� ������� ������������ �����! ��������� � ������� ��� ���");
                }else{
                    switch (weaponChoice){
                        case 1:
                            weaponType = Weapon.PLASMA_GUN;
                            break;
                        case 2:
                            weaponType = Weapon.GRENADE_LAUNCHER;
                            break;
                        case 3:
                            weaponType = Weapon.INFERNO_PISTOL;
                            break;
                        case 4:
                            weaponType = Weapon.MULTI_MELTA;
                            break;
                        case 5:
                            weaponType = null;
                            break;
                    }
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("���� ������ int!");
            }
        }
    }

    private void setHealth(){
        while(true){
            System.out.print("������� �������� ������ 0 (Long)health: ");
            try{
                String sHealth = Scan();
                if (sHealth.replaceAll(" ", "")==""){
                    health = null;
                    break;
                }
                health = Long.parseLong(sHealth);
                if (health<=0){
                    System.out.println("�������� health ������ ���� ������ 0!");
                }else{
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("���� ������ Long!");
            }
        }
    }
    public void setId(){
        this.id = (int) (Math.random() * 1000000)+1; //������ ����� ����� + 1 �� > 0
    }
    //��������� ������� ������ �� ���� �� �������� � ��� ���� ������
    private void setName(){
        while (true){
            System.out.print("������� ���: ");
            name = Scan();
            if(name.replaceAll(" ", "")==""){
                System.out.println("�� ����� ������ �������! ��� �� ����� ���� ������ ��������.");
            }else{break;}
        }
    }

    public int getId(){
        return id;
    }
    public Chapter getChapter(){return chapter; }
    public Weapon getWeaponType(){return weaponType;}
    public java.time.LocalDateTime getDate(){return creationDate;}

    @Override
    public String toString(){
        return ("Name: "+name+ "\nid: "+ String.valueOf(id) + "\n����������: "+ coordinates+"\n����: "+ creationDate+"\nhealth: "+ health+", heartCount: "+heartCount +
                "\nweaponType: "+ weaponType + "\nmeleeWeapon: "+meleeWeapon+"\nChapter: "+ chapter);
    }
}

