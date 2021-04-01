import React from 'react'
import Link from 'next/link'

export const Footer = () =>{
    return (
      <div class="footer d-flex justify-content-evenly align-items-center">
        <Link href="/" class="link">
          Home
        </Link>
        <Link href="/animals" class="link">
          Know Your Feral Animal
        </Link>
        <Link href="/about" class="link">
          About Us
        </Link>
      </div>
    );
}