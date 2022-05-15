package model;

public class Ball implements Comparable, Toss {
    private int idBall;
    private String ballName;
    private int sizeBall;
    private int yearBall;

    public Ball(int idBall, String ballName, int sizeBall, int yearBall) {
        this.idBall = idBall;
        this.ballName = ballName;
        this.sizeBall = sizeBall;
        this.yearBall = yearBall;
    }

    public Ball(String text) {
        String[] path = text.split(",");
        this.idBall = Integer.parseInt(path[0]);
        this.ballName = path[1];
        this.sizeBall = Integer.parseInt(path[2]);
        this.yearBall = Integer.parseInt(path[3]);
    }

    public int getIdBall() {
        return idBall;
    }

    public void setIdBall(int idBall) {
        this.idBall = idBall;
    }

    public String getBallName() {
        return ballName;
    }

    public void setBallName(String ballName) {
        this.ballName = ballName;
    }

    public int getSizeBall() {
        return sizeBall;
    }

    public void setSizeBall(int sizeBall) {
        this.sizeBall = sizeBall;
    }

    public int getYearBall() {
        return yearBall;
    }

    public void setYearBall(int yearBall) {
        this.yearBall = yearBall;
    }

    @Override
    public String toString() {
        String text = " Name Ball : " + this.ballName + "\n";
        text += "Size Ball :" + this.sizeBall + "\n";
        text += "Year Ball :" + this.yearBall + "\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        Ball x = (Ball) o;
        return this.sizeBall == x.getSizeBall();
    }


    @Override
    public int compareTo(Object o) {
        Ball x = (Ball) o;
        if (this.sizeBall > x.sizeBall) {
            return 1;
        } else if (this.sizeBall < x.sizeBall) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public void tossball() {
        System.out.println("Mingea a fost aruncata");
    }
}
