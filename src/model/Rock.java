package model;

public class Rock implements Comparable,Toss {
    private int idRock;
    private int sizeOfRock;
    private String typeOfRock;

    public Rock(int idRock, int sizeOfRock, String nameOfRock) {
        this.idRock = idRock;
        this.sizeOfRock = sizeOfRock;
        this.typeOfRock = nameOfRock;
    }

    public Rock(String text){
        String [] path = text.split(",");
        this.idRock=Integer.parseInt(path[0]);
        this.sizeOfRock=Integer.parseInt(path[1]);
        this.typeOfRock=path[2];
    }

    public int getIdRock() {
        return idRock;
    }

    public void setIdRock(int idRock) {
        this.idRock = idRock;
    }

    public int getSizeOfRock() {
        return sizeOfRock;
    }

    public void setSizeOfRock(int sizeOfRock) {
        this.sizeOfRock = sizeOfRock;
    }

    public String getTypeOfRock() {
        return typeOfRock;
    }

    public void setTypeOfRock(String typeOfRock) {
        this.typeOfRock = typeOfRock;
    }

    @Override
    public String toString() {
        String text = "Size of Rock : " + this.sizeOfRock + "\n";
        text += "Type of Rock : " + this.typeOfRock + "\n";
        return text;
    }


    @Override
    public boolean equals(Object o) {
        Rock x = (Rock) o;
        return this.sizeOfRock == x.getSizeOfRock();
    }

    @Override
    public int compareTo(Object o) {
        Rock x = (Rock) o;
        if (this.sizeOfRock > x.getSizeOfRock()) {
            return 1;
        } else if (this.sizeOfRock < x.getSizeOfRock()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public void tossball() {
        System.out.println("Piatra a fost aruncata");
    }
}
