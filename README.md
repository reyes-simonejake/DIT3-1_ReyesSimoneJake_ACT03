## What design choices did you make (colors, fonts, layout)?
My main goal was to give the user profile screen a clean, modern look — something similar to what you’d see in today’s social media apps.  

For the **layout**, I used a `CoordinatorLayout` with a `CollapsingToolbarLayout` to create a nice scrolling effect on the header. The main content is inside a `ConstraintLayout` so everything adjusts properly on different screen sizes.  

In terms of **colors**, I went for a bright blue header to make it stand out, combined with a light gray background and a white card for the contact section. This helps the details pop and keeps the screen easy on the eyes.  

For the **fonts**, I used Material 3’s default typography. The username is bold and large for emphasis, while the bio and contact details use medium-sized text for a clean and balanced look.

---

## How did you ensure the screen is user-friendly and accessible?
I designed the screen to be simple and easy to navigate. The information flows naturally from the profile header to the details below.  

To make it more **accessible**, I kept strong color contrast for better readability and made sure all touch targets are large enough for easy tapping. I also added `contentDescription` for images so screen readers can describe them for users with visual impairments.

---

## What would you improve if this were a real app?
If this were a real app, I’d make the “Edit Profile” button functional and allow users to actually update their info. The profile data would come from a real database instead of being hardcoded.  

I’d also add image loading using a library like Glide or Coil, include dark mode support, and use the MVVM architecture to handle data more efficiently and keep the UI responsive.
