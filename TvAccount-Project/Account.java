public class Account
{
    private String name;
    private String channels;
    private int monthsActive;
    
    /**
      No arg Constructor
    */
    public Account()
    {
      name = "Domonique";
      channels = "HBO";
      monthsActive = 12;
    }
    
    /**
      Constructor for the Account class
      @param name The name
      @param channels The channels
      @param monthsActive The amount of months active
    */
     public Account(String name, String channels, int monthsActive)
    {
      this.name = name;
      this.channels = channels;
      this.monthsActive = monthsActive;
    }

    /**
      @return name Returns the user name
    */
    public String getName() {
        return name;
    }

    /**
      @param name Sets the user name
    */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
      @return the channels
    */
    public String getChannels() {
        return channels;
    }
    
    /**
      @param channels Sets the channels
    */
    public void setChannels(String channels) {
        this.channels = channels;
    }

    /**
    @return monthsActive Returns the months active
    */
    public int getMonthsActive() {
        return monthsActive;
    }

    /**
      @param monthsActive Sets the months active
    */
    public void setMonthsActive(int monthsActive) {
        this.monthsActive = monthsActive;
    }

    /**
      to string method
    */
    public String toString() {
        return "name: " + name + 
                "\n, channels: " + channels +
                ", monthsActive: " + monthsActive;
               
    }
    
    /**
      copy constructor
      @param Account object
    */
    public Account(Account obj)
    {
      
      this.name = obj.name;
      this.channels = obj.channels;
      this.monthsActive = obj.monthsActive;

    }
}