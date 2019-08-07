package com.panjikrisnayasa.submissionandroidpemula;

import java.util.ArrayList;

class ShoesData {

    private static String[][] shoesData = new String[][]{
            {"Nike Blazer Mid", "Lifestyle", "$260", "The Nike Blazer Mid has made it from the basketball court to the skate session to the sidewalks of sneaker fame.", "https://c.static-nike.com/a/images/t_PDP_1280_v1/f_auto/x1q49nrsbgdenslfdbwa/blazer-mid-77-vintage-shoe-dNWPTj.jpg"},
            {"Vans Old Skool", "Skateboard", "$66", "The Old Skool, Vans classic skate shoe and the first to bear the iconic side stripe, has a low-top lace-up silhouette with a durable suede and canvas upper with padded tongue and lining and Vans signature Waffle Outsole.", "https://images.vans.com/is/image/Vans/D3HY28-HERO?$583x583$"},
            {"Adidas Runfalcon", "Women's running shoe", "$44", "Start clocking miles in these lightweight running shoes. On the treadmill or the streets, they add comfort to each step with soft cushioning. The supportive sneakers have an airy material-mix upper and a midfoot cage for extra support.", "https://assets.adidas.com/images/w_600,h_600,f_auto,q_auto:sensitive,fl_lossy/449c838942da409f8ba9a97f00d3cffe_9366/Runfalcon_Shoes_Black_F36199_01_standard.jpg"},
            {"Adidas Pro Next 2019", "Basketball", "$86", "Work on your game in comfort in these basketball shoes. They feature a Cloudfoam midsole for enhanced cushioning as you get up and down the court. A mixed two-way upper lets you attack defenders with no distractions, and a herringbone outsole provides extra traction for quick changes of direction.", "https://static.shop.adidas.co.id/media/catalog/product/cache/2/thumbnail/1200x/9df78eab33525d08d6e5fb8d27136e95/G/5/G54445_SMC_eCom.jpg"},
            {"Nike Air Max 270 React", "Women's shoe", "$150", "Taking design cues from the iconic Air Max 180 and Air Max 93, the all-new Air Max 270 features the first-ever air unit designed expressly for a lifestyle shoe, a unit that clocks in as the tallest-ever at 32-mm. Filled with fresh Oregon air right down the road from the main Nike campus, the Air Max 270 blends elements from the Air Max family's past with a new, zonal-mesh upper for a hybrid sneaker that moves the legacy forward.", "https://c.static-nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/nex5fgeecvdhjrmbiiyl/air-max-270-react-womens-shoe-rHg2Ch.jpg"},
            {"Converse One Star Archieve Low", "Lifestyle", "$70", "Essential Converse One Star sneakers in classic cotton canvas, featuring an allover camo print. Low top silhouette offers a lace front closure, lightly padded ankle collar and star detailing at the side. Lace front closure offers a customizable fit while grippy rubber sole makes every step stick.", "https://www.converse.com/dw/image/v2/BCZC_PRD/on/demandware.static/-/Sites-cnv-master-catalog/default/dw0fd83e8b/images/a_107/165027C_A_107X1.jpg?sw=964"},
            {"Converse Jack Purcell Canvas Low", "Lifestyle", "$60", "An effortlessly sharp addition to your closet, with Jack's signature \"smile\" at the toe.", "https://www.converse.com/dw/image/v2/BCZC_PRD/on/demandware.static/-/Sites-cnv-master-catalog/default/dw0f708dd1/images/a_107/164057C_A_107X1.jpg?sw=964"},
            {"Converse One Star CC Pro Slip", "Skateboard, Slip-on", "$65", "Suede slip-ons made for skate", "https://www.converse.com/dw/image/v2/BCZC_PRD/on/demandware.static/-/Sites-cnv-master-catalog/default/dw6bdcc7df/images/a_107/164156C_A_107X1.jpg?sw=964"},
            {"Vans Camo Check Old Skool", "Skateboard", "$60", "The Camo Check Old Skool, the Vans classic skate shoe and first to bare the iconic sidestripe, is a low top lace-up featuring printed canvas and suede uppers, re-enforced toecaps to withstand repeated wear, padded collars for support and flexibility, and signature rubber waffle outsoles.", "https://images.vans.com/is/image/Vans/8G1NRA-HERO?$583x583$"},
            {"Adidas NMD_TS1 Primeknit GTX", "Lifestyle", "$214", "These shoes combine archival cues with contemporary details. The foot-hugging adidas Primeknit textile upper has a waterproof GORE-TEX lining, and the speed lacing system can also be covered by a fold-over flap to help keep water out. The midsole comfort is elevated with the responsive cushioning of Boost.", "https://static.shop.adidas.co.id/media/catalog/product/cache/2/thumbnail/1200x/9df78eab33525d08d6e5fb8d27136e95/B/D/BD8078_FLT_eCom.jpg"},
            {"Yeezy Boost 350 V2 Lundmark RF", "Lifestyle", "$220", "The YEEZY BOOST 350 V2  Lundmark RF features an upper composed of two-toned re-engineered Primeknit with reflective threading. The post-dyed monofilament side stripe is woven into the upper. Reflective threads are woven into the laces. The midsole utilizes adidas’ innovative BOOST™ technology .", "https://sneakernews.com/wp-content/uploads/2019/07/yeezy-lundmark-reflective-rf-store-list.jpg?w=780"},
            {"Air Jordan 1 Retro High OG \"Twist\"", "Women's shoe", "$325", "The Air Jordan 1 Retro High OG \"Twist\" Women's Shoe delivers all-day comfort and support in an iconic silhouette. A supple leather and textile upper maintains the classic look on the Jordan 1 Retro Panda, while time-tested cushioning keeps you comfortably on the go.", "https://sneakerbardetroit.com/wp-content/uploads/2019/04/Air-Jordan-1-Panda-WMNS-CD0461-007-Release-Date-4.jpg"}
    };

    static ArrayList<Shoe> getListData() {
        ArrayList<Shoe> list = new ArrayList<>();
        for (String[] tData : shoesData) {
            Shoe shoe = new Shoe();
            shoe.setName(tData[0]);
            shoe.setCategory(tData[1]);
            shoe.setPrice(tData[2]);
            shoe.setDescription(tData[3]);
            shoe.setPhoto(tData[4]);
            list.add(shoe);
        }
        return list;
    }
}
