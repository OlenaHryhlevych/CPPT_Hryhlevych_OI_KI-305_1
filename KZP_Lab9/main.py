from experimental_cat import ExperimentalCat


def main():
    my_cat = ExperimentalCat("Whity", 3, "Unknown")

    my_cat.display_info()

    my_cat.set_name("Bambas")
    my_cat.set_age(2)
    my_cat.set_breed("Persian")

    print("new cat info:")

    my_cat.display_info()

    my_cat.meow()
    my_cat.run()
    my_cat.jump()
    my_cat.eat("chicken")
    my_cat.play("mouse")
    print(my_cat.get_subject_type())


if __name__ == "__main__":
    main()
