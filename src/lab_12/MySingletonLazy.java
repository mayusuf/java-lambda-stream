package lab_12;

import java.util.Optional;

public class MySingletonLazy {

    private static MySingletonLazy instace = null;

    public synchronized static MySingletonLazy getInstance() {
        return Optional.ofNullable(instace).orElseGet(MySingletonLazy::new);
    }
}
