import styles from '../styles/Home.module.css';
import 'bootstrap/dist/css/bootstrap.css';
import { Layout } from '../components/Layout';
import AnimalSection from '../components/AnimalSection'
import { Carousel } from 'react-responsive-carousel';
import "react-responsive-carousel/lib/styles/carousel.min.css"; // requires a loader

export default function Home() {


  return (
    <>
      <Layout>
        <Carousel 
        showThumbs={false}
        interval={3000}
        autoPlay={true}
        infiniteLoop={true}
        centerMode={true}
        centerSlidePercentage={100}
        dynamicHeight={true}
        >
          <div>
            <img src="/carousel-0.jpeg"/>
          </div>
          <div>
            <img src="/carousel-1.jpeg"/>
          </div>
          <div>
            <img src="/carousel-2.jpeg"/>
          </div>
          <div>
            <img src="/carousel-3.jpeg"/>
          </div>
          <div>
            <img src="/carousel-4.jpeg"/>
          </div>
          <div>
            <img src="/carousel-5.jpeg"/>
          </div>
        </Carousel>

      <AnimalSection></AnimalSection>


      </Layout>
    </>
  );
}
