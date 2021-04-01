import {React, useState} from 'react';
import Link from 'next/link'

export const Nav = () => {
    const [isCollapsed, setIsCollapsed] = useState(true)

    const handleCollapse = () => setIsCollapsed(!isCollapsed);
  
    return (
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid justify-content-between" style={{width: 100 + '%'}}>
          <a class="nav-link" href="/">
            <img src="/logo.png"></img>
          </a>
          <button
            class="custom-toggler navbar-toggler"
            type="button"
            data-toggle="collapse"
            data-target="#navbarsExample09"
            aria-controls="navbarsExample09"
            aria-expanded={!isCollapsed ? true : false}
            aria-label="Toggle navigation"
            onClick={handleCollapse}
          >
            <span class="navbar-toggler-icon"></span>
          </button>
          <div
            class={`${isCollapsed ? "collapse" : ""} navbar-collapse justify-content-end`}
            id="navbar"
          >
            <div class="navbar-nav">
              <li class="nav-link">
                <Link href="/">Home</Link>
              </li>
              <li class="nav-link">
                <Link href="/animals">Know Your Feral Animals</Link>
              </li>
              <li class="nav-link">
                <Link href="/about">About Us</Link>
              </li>
            </div>
          </div>
        </div>
      </nav>
    );
}