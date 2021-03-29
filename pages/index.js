import Head from 'next/head'
import styles from '../styles/Home.module.css'
import 'bootstrap/dist/css/bootstrap.css'
import { Nav } from '../components/Nav'
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

      <Nav />

      <div class="first d-flex align-items-center">
        <div>
          <h2>
            Australia is home to many animals that have been introduced since
            European Settlement. Some of these are invasive - creating
            significant problems for Agriculture in Victoria.
          </h2>
          <div class="d-flex justify-content-center">
            <button class="btn btn-secondary btn-lg">KNOW MORE </button>
          </div>
        </div>
      </div>

      <div class="second d-flex align-items-center">
          <div>
            <img src="/photo-2.png"></img>
          </div>
          <div class='paragraph'>
          <h4>
            Invasive Species, also known as feral/pest animals is a statewide
            problem in Victoria that destroy habitat, pollute our water, damage
            farmland and kill precious native plants and animals. Feral footprints
            takes the initiative to help Farmers in Victoria to learn about these
            species and provide possible solutions to eradicate them.
          </h4>
          </div>
      </div>

      <div class='footer d-flex justify-content-evenly align-items-center'>
          <Link href='/' class='link'>Home</Link>
          <Link href='/' class='link'>Know Your Feral Animal</Link>
          <Link href='/' class='link'>About Us</Link>
      </div>
    </>
  );
}
