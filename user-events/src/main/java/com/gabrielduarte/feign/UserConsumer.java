package com.gabrielduarte.feign;

import com.gabrielduarte.domain.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@FeignClient(url = "https://swapi.dev/api/people/", name = "starWars")
public interface UserConsumer {

    @RequestMapping("{id}/")
    UserDTO getCharacterById(@PathVariable String id);

}
