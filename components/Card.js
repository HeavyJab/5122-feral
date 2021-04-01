import React from "react";

export const Card = (props) => {
  const { title, src, desc } = props;
  return (
    <div class="card">
      <img src={src} class="card-img-top" alt="..." />
      <div class="card-body d-flex flex-column align-items-center justify-content-center">
        <h2 class="card-title">{title}</h2>
        <h5 class="card-title">{desc}</h5>
      </div>
    </div>
  );
};
