# Key Frame ConstraintLayout

## Requirements
* Both layouts should have the same ID
* Every child element on both layouts should have an ID

## App Demo
<img src="https://i.gyazo.com/46dc7c0bf0d4401062336c5c08e4e0d9.gif" width="350px" height="650px" />

## App Demo with Drawable Set Programmatically
```
my_textview.setDrawableLeft(R.drawable.ic_account_circle)
    
private fun TextView.setDrawableLeft(drawable: Int) {
   this.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, 0, 0, 0)
}
```
<img src="https://gyazo.com/7b8ff4e32e34cafd88be721778b3f43e.gif" width="350px" height="650px" />
