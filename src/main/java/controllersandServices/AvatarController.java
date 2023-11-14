package controllersandServices;

import java.util.Collection;

@RestController

public class AvatarController {

    @GetMapping
    public Collection<Avatar> findAvatars(@RequestParam int page
    @RequestParam int pageSize){

        return service.find(page, pageSize);
    }
 }
