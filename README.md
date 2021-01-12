# RecyclerView Sample

A simplified use of RecyclerView. I decided to look over a [RecyclerView CodeLab](https://developer.android.com/codelabs/android-training-create-recycler-view#0) to help me understand the view and extract the key parts from Dalo's training sample to act as a guide for future use. The result is a simpler version of what Dalo did extracted from all other functionality.

## Commit Versions

Every commit has added functionality.

- [9ba2727](https://github.com/aormsbyEIT/RecyclerView_Dalo_plus_CodeLab/commit/9ba27272029fe07a8e8a8496fb793c25b708c0f3) -> Basic RecyclerView implementation, displays a scrollable list of words
- [163d663](https://github.com/aormsbyEIT/RecyclerView_Dalo_plus_CodeLab/commit/163d663c283657e434fc370c338cffafe73b29da) -> Add click event to RecyclerView list item by adding onClickListener into the custom ViewHolder class, changes text on click (unsure if best practice, but it works)

## CodeLab Notes

The descriptions in CodeLab steps are *great* fo understanding, but it does some silly things. For example:

- It uses older code libraries for some views. My sample does not, because AndroidX is newer and better. Dalo used AndroidX.
- It uses a LinkedList for the list data. I have no idea why. Doesn't seem to matter. I stuck with List.

If you do read the CodeLab, just be aware that the isntructions in the CodeLab are not the same as how Dalo's sample was set up. That's all.

