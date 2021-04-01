import React from "react";
import Link from 'next/link';

const AnimalNav = (props) => {
  return (
    <div class="animal-container">
      <div class="animal-section-1">
        <h4>How well do you know your feral animals?</h4>

        <ul class="nav nav-tabs">
          <li class="nav-link">
            <Link href="/animals/fox">Fox</Link>
          </li>
          <li class="nav-link">
            <Link href="/animals/pig">Pig</Link>
          </li>
          <li class="nav-link">
            <Link href="/animals/goat">Goat</Link>
          </li>
          <li class="nav-link">
            <Link href="/animals/dog">Dog</Link>
          </li>
          <li class="nav-link">
            <Link href="/animals/rabbit">Rabbit</Link>
          </li>
        </ul>
        <div class="divider"></div>
          {props.children}
      </div>
    </div>
  );
};

export default AnimalNav