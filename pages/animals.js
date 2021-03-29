import Head from 'next/head'
import 'bootstrap/dist/css/bootstrap.css'
import { Nav } from '../components/Nav'
import { Card } from '../components/Card'
import Link from 'next/link'

export default function Home() {


  return (
    <>
      <Head>
        <title>5eral Footprint</title>
        <link rel="icon" href="/favicon.ico" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <meta charset="utf-8" />
      </Head>

      <Nav/>

    <div class='animal-container'>
        <div class="animal-section-1">
            <h4>How well do you know your feral animals?</h4>
            <div class='animal-section-2 d-flex justify-content-center'>
            <Card
                title={'Feral Fox (Vulpes Vulpes)'}
                src={'/fox.png'}
                href={'/'}
            ></Card>
            <Card
                title={'Feral European Rabbit (Oryctolagus cuniculus) '}
                src={'/rabbit.png'}
                href={'/'}
            ></Card>
            <Card
                title={'Feral Cat (Felis catus) '}
                src={'/cat.png'}
                href={'/'}
            ></Card>
            <Card
                title={'Feral Goat (Capra hircus)'}
                src={'/goat.png'}
                href={'/'}
            ></Card>
            <Card
                title={'Feral Pig (Sus scrofa)'}
                src={'/pig.png'}
                href={'/'}
            ></Card>
            </div>
        </div>
    </div>
      

      <div class='footer d-flex justify-content-evenly align-items-center'>
          <Link href='/' class='link'>Home</Link>
          <Link href='/animals' class='link'>Know Your Feral Animal</Link>
          <Link href='/about' class='link'>About Us</Link>
      </div>
    </>
  );
}
