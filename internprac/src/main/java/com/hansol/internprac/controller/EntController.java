package com.hansol.internprac.controller;

import com.hansol.internprac.domain.Ent;
import com.hansol.internprac.dto.EntDto;
import com.hansol.internprac.repository.DTOO;
import com.hansol.internprac.repository.EntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EntController {
    @Autowired
    private EntRepository entRepository;

    @GetMapping("/zz")
    public void push() {
        Ent e1 = new Ent("445", "AAA", 1000);
        Ent e2 = new Ent("223", "AAA", 1000);
        Ent e3 = new Ent("2313", "AAA", 1000);
        Ent e4 = new Ent("4", "AAA", 1000);

        entRepository.save(e1);
        entRepository.save(e2);
        entRepository.save(e3);
        entRepository.save(e4);

    }

    @GetMapping("/page")
    public ResponseEntity<?> test(@PageableDefault(size = 2, sort = "id", page = 0) Pageable pageable) {
        List<Object[]> aaaa = entRepository.findBytitle("AAA", pageable).getContent();

        List<EntDto> ret = new ArrayList<>();
        for (Object[] o : aaaa) {
            ret.add(new EntDto((String) o[0], (String) o[1]));
        }
        return ResponseEntity.ok(ret);
    }
}
