public class Hero {
    private String name;
    private int HP;
    private int MP;
    private int strength;
    private int wisdom;
    private int defense;
    private Skill skill;

    public enum Skill{
        COLLIDING,WATERBALL
    }

    public Hero(String name, Skill skill){
        this.name = name;
        this.skill = skill;
    }

    public void attack(Hero targetHero){
        switch (skill) {
            case COLLIDING:
                System.out.println("%s 使用了衝撞攻擊");
                targetHero.losthp(getStrength() - targetHero.getDefense());
                break;
        
            case WATERBALL:
                System.out.println("%s 使用了水球攻擊");
                lostmp(5);
                targetHero.losthp(getWisdom() * 2);
                break;
        }
        System.out.printf("%s 的HP剩下 %d。\n", targetHero.getName(),targetHero.getHp());
    }

    private void losthp(int hp){
        setHp(getHp() - hp);
    }

    private void lostmp(int mp){
        if(getMp() < mp)
            throw new MpNotEnoughException();
        setMp(getMp() - mp);
    }

    public boolean isAlive() {return HP > 0;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getHp() {return HP <= 0 ? 0 : HP;}

    public void setHp(int HP) {
        this.HP = HP;
        if(!isAlive()){
            System.out.printf("%s 已陣亡。\n", getName());
        }
    }

    public int getMp(){return MP;}

    public void setMp(int MP){
        this.MP = mp;
    }

    public int getStrength() {return strength;}

    public void setStrength(int strength) {this.strength = strength;}

    public int getWisdom() {return wisdom;}

    public void setWisdom(int wisdom) {this.wisdom = wisdom;}

    public int getDefense() {return defense;}

    public void setDefense(int defense) {this.defense = defense;}

    public Skill getSkill() {return skill;}

    public void setSkill(Skill skill) {this.skill = skill;}
}