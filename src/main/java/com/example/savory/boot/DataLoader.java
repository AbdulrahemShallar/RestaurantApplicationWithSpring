package com.example.savory.boot;

import com.example.savory.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.savory.model.*;

@Component
public class DataLoader implements CommandLineRunner {

    private MainRepository mainRepository;
    @Autowired
     public void setMainRepository(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Products product=new Products();
        product.setName("Sushi, Japan");
        product.setShortDescription("Prepared with vinegared rice and a wide range of ingredients including seafood..");
        product.setFullDescription("");
        product.setPrice("$19.15");
       // product.setNormalPath("../static/images/img1.jpg");
        product.setNumberOfOrdering(0);
        product.setPath("/images/img1.jpg");
        mainRepository.save(product);

        product=new Products();
        product.setName("Kebab, Turkey");
        product.setShortDescription("A dish popular across the Middle East, Kebabs are originally from Turkey..");
        product.setFullDescription("");
        product.setPrice("$20.99");
       // product.setNormalPath("../static/images/img2.jpg");
        product.setPath("/images/img2.jpg");
        product.setNumberOfOrdering(0);
        mainRepository.save(product);

        product=new Products();
        product.setName("Paella, Spain");
        product.setShortDescription("Paella has got its roots in Valencia, Spain. It is an ancient dish recreated with a modern touc..");
        product.setFullDescription("");
        product.setPrice("$8.99");
       // product.setNormalPath("../static/images/img3.jpg");
        product.setPath("/images/img3.jpg");
        product.setNumberOfOrdering(0);
        mainRepository.save(product);

        product=new Products();
        product.setName("Lasagna, Italy");
        product.setShortDescription("Italy's lasagna takes over Pizza to be added in the \"world's best food dishes\" list because of..");
        product.setFullDescription("");
        product.setPrice("$2.99");
        //product.setNormalPath("../static/images/img4.jpg");
        product.setPath("/images/img4.jpg");
        product.setNumberOfOrdering(0);
        mainRepository.save(product);

        product=new Products();
        product.setName("Pizza, Italy");
        product.setShortDescription("Now who wouldn't be aware of this go-to dish that gives us the ultimate savouring ..");
        product.setFullDescription("");
        product.setPrice("$23.99");
       // product.setNormalPath("../static/images/img5.jpg");
        product.setPath("/images/img5.jpg");
        product.setNumberOfOrdering(0);
        mainRepository.save(product);

        product=new Products();
        product.setName("Goulash, Hungary");
        product.setShortDescription("A dish most popular in Central Europe, Goulash is stew meat dating back to 9th..");
        product.setFullDescription("");
        product.setPrice("$5.99");
        //product.setNormalPath("../static/images/img6.jpg");
        product.setPath("/images/img6.jpg");
        product.setNumberOfOrdering(0);
        mainRepository.save(product);

        product=new Products();
        product.setName("Golden Opulence Sundae");
        product.setShortDescription("The Golden Opulence Sundae is a dessert offered at Serendipity 3, a New York..");
        product.setFullDescription("");
        product.setPrice("$730.00");
        //product.setNormalPath("../static/images/img6.jpg");
        product.setPath("/images/img7.jpg");
        product.setNumberOfOrdering(1);
        mainRepository.save(product);


    }
}
