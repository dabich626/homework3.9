package controllersandServices;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RestMapping("/info")
public class InfoController {

    private final int port;

    public InfoController(@Value("${server.port}") int port){

        this.port = port;
    }

    @GetMapping("/getPort")
    public int port(){
        return port;
    }

    @GetMapping("/test")
    public int test(){
        long startTime = System.currentTimeMillis();

        int a = integer.valueOf(5);
        int sum = Stream.iterate(1,a -> a + 1).limit(1_000_000).reduce(0,(a,b) -> a + b);
        logger.info("Elapsed: {}", System.currentTimeMillis() - startTime);
        return sum;
    }
}
