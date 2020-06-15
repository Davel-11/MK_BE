package category;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/api/category", produces = MediaType.APPLICATION_JSON_VALUE)
public class CategoryController {

    @GetMapping
    public ResponseEntity getAll() {
        return new ResponseEntity( "Gella", HttpStatus.OK );
    }

}
