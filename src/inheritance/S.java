package inheritance;

import oop.HeavyBox;

public class S extends R {
    @Override
    HeavyBox getInstance() {
        return new HeavyBox();
    }
}
