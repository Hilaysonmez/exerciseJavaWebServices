package com.kutuphane.exercise.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/page")
public class PageController {
    private final PageService pageService;

    @Autowired
    public PageController(PageService pageService){
        this.pageService = pageService;
    }

    @GetMapping
    public List<Page> getPages(){
        return pageService.getPages();
    }

   // @PostMapping
   // public void registerNewPage(@RequestBody Page Page) {
       // pageService.addNewPage(page);
   // }

    //@DeleteMapping(path = "{pageId}")
    //public void deletePage(@PathVariable("pageId") Long PageId){
     //   pageService.deletePage(pageId);
   // }

   // @PutMapping(path = "{pageId}")
   // public void updatePage(@PathVariable("pageId") Long)



}
