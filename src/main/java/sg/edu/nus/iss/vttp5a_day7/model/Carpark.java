package sg.edu.nus.iss.vttp5a_day7.model;

public class Carpark {
    
    private Integer id;
    
    private String carpark;

    private String category;

    private String weekdayFirst;

    private String weekdaySec;

    private String satRate;

    private String sunPHRate;

    public Carpark(Integer id, String carpark, String category, String weekdayFirst, String weekdaySec, String satRate,
            String sunPHRate) {
        this.id = id;
        this.carpark = carpark;
        this.category = category;
        this.weekdayFirst = weekdayFirst;
        this.weekdaySec = weekdaySec;
        this.satRate = satRate;
        this.sunPHRate = sunPHRate;
    }

    public Carpark() {
        //TODO Auto-generated constructor stub
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

    public String getWeekdayFirst() {
        return weekdayFirst;
    }

    public void setWeekdayFirst(String weekdayFirst) {
        this.weekdayFirst = weekdayFirst;
    }

    public String getWeekdaySec() {
        return weekdaySec;
    }

    public void setWeekdaySec(String weekdaySec) {
        this.weekdaySec = weekdaySec;
    }

    public String getSatRate() {
        return satRate;
    }

    public void setSatRate(String satRate) {
        this.satRate = satRate;
    }

    public String getSunPHRate() {
        return sunPHRate;
    }

    public void setSunPHRate(String sunPHRate) {
        this.sunPHRate = sunPHRate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((carpark == null) ? 0 : carpark.hashCode());
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + ((weekdayFirst == null) ? 0 : weekdayFirst.hashCode());
        result = prime * result + ((weekdaySec == null) ? 0 : weekdaySec.hashCode());
        result = prime * result + ((satRate == null) ? 0 : satRate.hashCode());
        result = prime * result + ((sunPHRate == null) ? 0 : sunPHRate.hashCode());
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
        if (weekdayFirst == null) {
            if (other.weekdayFirst != null)
                return false;
        } else if (!weekdayFirst.equals(other.weekdayFirst))
            return false;
        if (weekdaySec == null) {
            if (other.weekdaySec != null)
                return false;
        } else if (!weekdaySec.equals(other.weekdaySec))
            return false;
        if (satRate == null) {
            if (other.satRate != null)
                return false;
        } else if (!satRate.equals(other.satRate))
            return false;
        if (sunPHRate == null) {
            if (other.sunPHRate != null)
                return false;
        } else if (!sunPHRate.equals(other.sunPHRate))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return id + "," + carpark + "," + category + ","
                + weekdayFirst + "," + weekdaySec + "," + satRate + "," + sunPHRate;
    }
}
