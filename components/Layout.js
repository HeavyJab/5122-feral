import React from 'react'
import { Nav } from './Nav'
import { Footer } from './Footer'
import Head from 'next/head'

export const Layout = (props) => {
    return (
      <>
        <Head>
          <title>5eral Footprint</title>
          <link rel="icon" href="/favicon.ico" />
          <meta name="viewport" content="width=device-width, initial-scale=1" />
          <meta charset="utf-8" />
        </Head>
        <Nav></Nav>
        {props.children}
        <Footer></Footer>
      </>
    );
}