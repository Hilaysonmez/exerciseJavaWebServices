package com.kutuphane.exercise.page;

import com.kutuphane.exercise.page.Page;
import com.kutuphane.exercise.page.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageService {
    private final PageRepository pageRepository;

    @Autowired
    public PageService(PageRepository pageRepository){
        this.pageRepository = pageRepository;
    }

    public List<Page> getPages(){

        return pageRepository.findAll();
    }

    //public void addNewPage(Page page) {

    //}


}
