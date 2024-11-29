package sg.edu.nus.iss.vttp5a_day7.model;

public class Carpark {
    
    private Integer id;

    private String carpark;

    private String category;

    private String weekDayRate1;

    private String weekDayRate2;

    private String saturdayRate;

    private String sundayPHRate;

    public Carpark(Integer id, String carpark, String category, String weekDayRate1, String weekDayRate2,
            String saturdayRate, String sundayPHRate) {
        this.id = id;
        this.carpark = carpark;
        this.category = category;
        this.weekDayRate1 = weekDayRate1;
        this.weekDayRate2 = weekDayRate2;
        this.saturdayRate = saturdayRate;
        this.sundayPHRate = sundayPHRate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarpark() {
        return carpark;
    }

    public void setCarpark(String carpark) {
        this.carpark = carpark;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWeekDayRate1() {
        return weekDayRate1;
    }

    public void setWeekDayRate1(String weekDayRate1) {
        this.weekDayRate1 = weekDayRate1;
    }

    public String getWeekDayRate2() {
        return weekDayRate2;
    }

    public void setWeekDayRate2(String weekDayRate2) {
        this.weekDayRate2 = weekDayRate2;
    }

    public String getSaturdayRate() {
        return saturdayRate;
    }

    public void setSaturdayRate(String saturdayRate) {
        this.saturdayRate = saturdayRate;
    }

    public String getSundayPHRate() {
        return sundayPHRate;
    }

    public void setSundayPHRate(String sundayPHRate) {
        this.sundayPHRate = sundayPHRate;
    }

    @Override
    public String toString() {
        return id + "," + carpark + "," + category + ","
                + weekDayRate1 + "," + weekDayRate2 + "," + saturdayRate + ","
                + sundayPHRate;
    }

    /* @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((carpark == null) ? 0 : carpark.hashCode());
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + ((weekDayRate1 == null) ? 0 : weekDayRate1.hashCode());
        result = prime * result + ((weekDayRate2 == null) ? 0 : weekDayRate2.hashCode());
        result = prime * result + ((saturdayRate == null) ? 0 : saturdayRate.hashCode());
        result = prime * result + ((sundayPHRate == null) ? 0 : sundayPHRate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carpark other = (Carpark) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (carpark == null) {
            if (other.carpark != null)
                return false;
        } else if (!carpark.equals(other.carpark))
            return false;
        if (category == null) {
            if (other.category != null)
                return false;
        } else if (!category.equals(other.category))
            return false;
        if (weekDayRate1 == null) {
            if (other.weekDayRate1 != null)
                return false;
        } else if (!weekDayRate1.equals(other.weekDayRate1))
            return false;
        if (weekDayRate2 == null) {
            if (other.weekDayRate2 != null)
                return false;
        } else if (!weekDayRate2.equals(other.weekDayRate2))
            return false;
        if (saturdayRate == null) {
            if (other.saturdayRate != null)
                return false;
        } else if (!saturdayRate.equals(other.saturdayRate))
            return false;
        if (sundayPHRate == null) {
            if (other.sundayPHRate != null)
                return false;
        } else if (!sundayPHRate.equals(other.sundayPHRate))
            return false;
        return true;
    }
 */
    
}
