//
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
//
// ****************************************************************
public class Yorkshire extends Dog {
    public Yorkshire(String name) {
    super(name);
    }
    public String speak() {
    return "woof";
    }
    }