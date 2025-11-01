## What design choices did you make (colors, fonts, layout)?

The primary goal was to modernize the initial design and create a user profile screen that feels clean, dynamic, and visually appealing, similar to what one might find in a modern social media app.

### Layout
*   I transitioned from a static layout to a more dynamic `CoordinatorLayout` with a `CollapsingToolbarLayout`. This creates a parallax scrolling effect for the header image, which adds a professional and engaging feel as the user scrolls.
*   The main content area uses a `ConstraintLayout` to precisely position key elements like the overlapping profile picture and the centered text fields, ensuring a responsive design that adapts well to different screen sizes.
*   Related contact information (Email and Phone) was grouped into a single visual `LinearLayout` with a custom rounded background, creating a clean, card-like element that separates it from the main profile details.

### Colors
*   I created a new, vibrant color palette inspired by modern UI trends. The scheme uses a strong `profile_primary` blue for the header, a neutral `profile_background` (#F0F2F5) for the body to reduce eye strain, and crisp white (`profile_card_background`) for the contact info card to make it stand out.
*   Text colors were chosen for a clear hierarchy: `profile_text_primary` (near-black) for important text like the username and `profile_text_secondary` (gray) for supplementary text like the bio and contact details.

### Fonts (Typography)
*   To establish a clear visual hierarchy, I used Material 3's built-in theme attributes for typography. The username uses `?attr/textAppearanceHeadlineSmall` with a bold style to make it the most prominent text element.
*   The user's bio uses `?attr/textAppearanceBodyMedium`, and the contact information uses `?attr/textAppearanceBodyLarge`, creating a consistent and readable text scale throughout the app.

---

## How did you ensure the screen is user-friendly and accessible?

User-friendliness and accessibility were key considerations throughout the redesign.

### User-Friendly Design
*   **Visual Hierarchy:** The layout is structured to guide the user's eye naturally: from the prominent header image and username down to the bio, call-to-action button, and finally the detailed contact information.
*   **Readability:** The chosen color palette provides strong contrast between text and backgrounds (e.g., dark text on a light background), and the font sizes are large enough to be easily readable.
*   **Layout Optimization:** I replaced inefficient `LinearLayout` blocks (containing just an icon and text) with a single `TextView` using a `drawableStart` compound drawable. This makes the layout flatter and more performant, leading to a smoother user experience.

### Accessibility
*   **Content Descriptions:** Every meaningful `ImageView` has a `contentDescription` attribute (e.g., `@string/profile_picture_desc`). This ensures that screen readers like TalkBack can announce the purpose of each image to visually impaired users.
*   **Touch Targets:** The "Edit Profile" button and the text fields for contact information have sufficient padding and size to be easily tappable, meeting accessibility guidelines for touch target dimensions.
*   **Text Contrast:** The text and background colors were chosen to meet WCAG (Web Content Accessibility Guidelines) contrast ratio recommendations, ensuring readability for users with low vision.

---

## What would you improve if this were a real app?

If this were a real application, I would build upon this prototype with several key improvements to enhance functionality and user experience.

1.  **Real Functionality:** The most obvious next step is to add real functionality. The "Edit Profile" button would navigate to a new screen where the user could actually update their name, bio, and profile picture. The contact information could be made interactive, allowing a user to tap the email address to compose an email or tap the phone number to initiate a call.

2.  **Dynamic Data Loading:** Instead of using hardcoded strings and drawables, the profile data would be loaded dynamically from a remote server or a local database. I would implement a loading state (e.g., showing shimmer placeholders) to provide better feedback to the user while the data is being fetched.

3.  **Image Handling:** I would use a dedicated image-loading library like Glide or Coil to efficiently fetch, cache, and display the profile picture and header image. This would also allow for features like tapping the profile picture to view it in full screen.

4.  **Dark Mode Theming:** While the layout uses a `DayNight` theme, I would explicitly define a distinct and visually appealing color palette for dark mode in `colors.xml` and `themes.xml (night)` to ensure the UI looks just as good in a dark environment.

5.  **State Management:** For a more complex app, I would introduce a proper architectural pattern like MVVM (Model-View-ViewModel) with LiveData or StateFlow to manage the UI state, handle data loading, and survive configuration changes (like screen rotation) without losing data.
