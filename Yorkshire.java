//
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
//
// ****************************************************************
public class Yorkshire extends Dog {

    private int breedWeight = 7500;

    public Yorkshire(String name) {
    super(name);
    }
    public String speak() {
    return "woof";
    }

    public int avgBreedWeight() {
        return breedWeight;
        }
    }